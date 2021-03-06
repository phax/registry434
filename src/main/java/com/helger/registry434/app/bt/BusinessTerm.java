/**
 * Copyright (C) 2019-2021 Philip Helger
 * http://www.helger.com
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.registry434.app.bt;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.Nonempty;

public final class BusinessTerm extends AbstractBT
{
  private final String m_sDataType;

  public BusinessTerm (@Nullable final BusinessGroup aParent,
                       @Nonnull @Nonempty final String sID,
                       @Nonnull @Nonempty final String sName,
                       @Nonnull @Nonempty final String sCard,
                       @Nonnull @Nonempty final String sDataType)
  {
    super (aParent, sID, sName, sCard);
    ValueEnforcer.notEmpty (sDataType, "DataType");
    m_sDataType = sDataType;
  }

  @Nonnull
  @Nonempty
  public String getDataType ()
  {
    return m_sDataType;
  }

  @Nonnull
  @Nonempty
  public String getDisplayName ()
  {
    return getID () + " " + getName () + " [" + getCard () + "]";
  }
}
