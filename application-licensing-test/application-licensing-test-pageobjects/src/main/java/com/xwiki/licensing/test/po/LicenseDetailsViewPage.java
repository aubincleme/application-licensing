/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package com.xwiki.licensing.test.po;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.xwiki.test.ui.po.ViewPage;

/**
 * The page that displays the license details.
 * 
 * @version $Id$
 * @since 1.6
 */
public class LicenseDetailsViewPage extends ViewPage
{
    @FindBy(css = "input[type='submit'][value='Generate License']")
    private WebElement generateLicenseButton;

    @FindBy(css = "pre.code")
    private WebElement licenseContainer;

    public String generateLicense()
    {
        this.generateLicenseButton.click();
        return getLicense();
    }

    public String getLicense()
    {
        return this.licenseContainer.getText();
    }
}
