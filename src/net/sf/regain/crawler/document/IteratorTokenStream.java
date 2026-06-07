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
package net.sf.regain.crawler.document;

import java.io.IOException;
import java.util.Iterator;

import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;

/**
 * A token stream reading tokens from an iterator.
 * (Currently not used.)
 *
 * @author Til Schneider, www.murfman.de
 */
public class IteratorTokenStream extends TokenStream {

  /** An iterator providing Strings. */
  private Iterator<String> mIter;
  
  /** The char term attribute. */
  private final CharTermAttribute termAtt = addAttribute(CharTermAttribute.class);


  /**
   * Creates a new instance of this class.
   *
   * @param iter An iterator providing Strings.
   */
  public IteratorTokenStream(Iterator<String> iter) {
    mIter = iter;
  }


  @Override
  public boolean incrementToken() throws IOException {
    if (mIter.hasNext()) {
      String text = mIter.next();
      clearAttributes();
      termAtt.append(text);
      return true;
    } else {
      return false;
    }
  }
}
