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
package com.helger.registry434.ui;

import java.util.Locale;

import javax.annotation.Nonnull;

import com.helger.html.request.IHCRequestField;
import com.helger.photon.uicore.html.select.HCExtSelect;
import com.helger.registry434.domain.EChangeTypeRestriction;

/**
 * Object status select.
 *
 * @author Philip Helger
 */
public class HCChangeTypeRestrictionSelect extends HCExtSelect
{
  public HCChangeTypeRestrictionSelect (@Nonnull final IHCRequestField aRF, @Nonnull final Locale aDisplayLocale)
  {
    super (aRF);

    for (final EChangeTypeRestriction e : EChangeTypeRestriction.values ())
      addOption (e.getID (), e.getDisplayName ());

    addOptionPleaseSelect (aDisplayLocale);
  }
}
