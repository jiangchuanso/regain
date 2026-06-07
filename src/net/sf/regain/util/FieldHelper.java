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

import org.apache.lucene.document.Field;
import org.apache.lucene.document.StoredField;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;

/**
 * Helper class for creating Lucene fields in a backward-compatible way.
 * Replaces the old Field.Index enum pattern from Lucene 4.x.
 */
public class FieldHelper {

  /**
   * Create a text field that will be analyzed (tokenized).
   *
   * @param name The field name
   * @param value The field value
   * @param store Whether to store the field
   * @return The created field
   */
  public static Field createTextField(String name, String value, boolean store) {
    return new TextField(name, value, store ? Field.Store.YES : Field.Store.NO);
  }

  /**
   * Create a string field that will NOT be analyzed (exact match).
   *
   * @param name The field name
   * @param value The field value
   * @param store Whether to store the field
   * @return The created field
   */
  public static Field createStringField(String name, String value, boolean store) {
    return new StringField(name, value, store ? Field.Store.YES : Field.Store.NO);
  }

  /**
   * Create a stored-only field (not indexed).
   *
   * @param name The field name
   * @param value The field value
   * @return The created field
   */
  public static StoredField createStoredField(String name, String value) {
    return new StoredField(name, value);
  }

  /**
   * Create a binary stored field.
   *
   * @param name The field name
   * @param value The binary value
   * @return The created field
   */
  public static StoredField createStoredField(String name, byte[] value) {
    return new StoredField(name, value);
  }
}
