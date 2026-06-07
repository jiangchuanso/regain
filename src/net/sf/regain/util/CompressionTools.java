/*
 * regain - A file search engine providing plenty of formats
 * Copyright (C) 2004  Til Schneider
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * Contact: Til Schneider, info@murfman.de
 */
package net.sf.regain.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/**
 * Simple compression utilities to replace Lucene's removed CompressionTools.
 * Uses Java's built-in Deflater/Inflater for compression.
 */
public class CompressionTools {

  /**
   * Compress a string to a byte array.
   *
   * @param value The string to compress
   * @return The compressed bytes
   */
  public static byte[] compressString(String value) {
    if (value == null) {
      return null;
    }
    byte[] input = value.getBytes(StandardCharsets.UTF_8);
    return compress(input);
  }

  /**
   * Compress a byte array.
   *
   * @param value The bytes to compress
   * @return The compressed bytes
   */
  public static byte[] compress(byte[] value) {
    if (value == null) {
      return null;
    }
    Deflater deflater = new Deflater(Deflater.BEST_COMPRESSION);
    deflater.setInput(value);
    deflater.finish();

    ByteArrayOutputStream bos = new ByteArrayOutputStream(value.length);
    byte[] buffer = new byte[1024];
    while (!deflater.finished()) {
      int len = deflater.deflate(buffer);
      bos.write(buffer, 0, len);
    }
    deflater.end();
    return bos.toByteArray();
  }

  /**
   * Decompress a byte array to a string.
   *
   * @param bytes The compressed bytes
   * @return The decompressed string
   * @throws IOException If decompression fails
   */
  public static String decompressString(byte[] bytes) throws IOException {
    if (bytes == null) {
      return null;
    }
    byte[] decompressed = decompress(bytes);
    return new String(decompressed, StandardCharsets.UTF_8);
  }

  /**
   * Decompress a byte array.
   *
   * @param bytes The compressed bytes
   * @return The decompressed bytes
   * @throws IOException If decompression fails
   */
  public static byte[] decompress(byte[] bytes) throws IOException {
    if (bytes == null) {
      return null;
    }
    Inflater inflater = new Inflater();
    inflater.setInput(bytes);

    ByteArrayOutputStream bos = new ByteArrayOutputStream(bytes.length * 2);
    byte[] buffer = new byte[1024];
    try {
      while (!inflater.finished()) {
        int len = inflater.inflate(buffer);
        if (len == 0 && inflater.needsInput()) {
          break;
        }
        bos.write(buffer, 0, len);
      }
    } catch (DataFormatException e) {
      throw new IOException("Decompression failed", e);
    } finally {
      inflater.end();
    }
    return bos.toByteArray();
  }
}
