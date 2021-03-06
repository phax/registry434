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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.helger.html.hc.IHCNode;
import com.helger.html.hc.html.sections.HCH5;
import com.helger.html.hc.impl.HCNodeList;
import com.helger.photon.app.html.IHTMLProvider;
import com.helger.photon.bootstrap4.uictrls.ext.BootstrapLoginHTMLProvider;
import com.helger.photon.bootstrap4.uictrls.ext.BootstrapLoginManager;
import com.helger.photon.core.execcontext.ISimpleWebExecutionContext;
import com.helger.registry434.app.CApp;
import com.helger.security.authentication.credentials.ICredentialValidationResult;

public final class AppLoginManager extends BootstrapLoginManager
{
  public AppLoginManager ()
  {
    super (CApp.APP_NAME + " Administration - Login");
  }

  @Override
  protected IHTMLProvider createLoginScreen (final boolean bLoginError, @Nonnull final ICredentialValidationResult aLoginResult)
  {
    return new BootstrapLoginHTMLProvider (bLoginError, aLoginResult, getPageTitle ())
    {
      @Override
      protected IHCNode createPageHeader (@Nonnull final ISimpleWebExecutionContext aSWEC, @Nullable final IHCNode aPageTitle)
      {
        final HCNodeList ret = new HCNodeList ();
        ret.addChild (super.createPageHeader (aSWEC, aPageTitle));
        ret.addChild (new HCH5 ().addChild ("CEN/TC 434 registry services for EN 16391 related artifacts"));
        return ret;
      }
    };
  }
}
