/*
 * Copyright (C) 2020 The Dirty Unicorns Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dirtyunicorns.themes.utils;

public class ThemeDbUtils {

    private int mId;
    private String mThemeName;
    private String mThemeDayOrNight;
    private String mThemeNightColor;
    private String mThemeSwitch;
    private String mAdaptativeIconShape;
    private String mThemeFont;
    private String mThemeIconShape;
    private String mThemeSbIcons;
    private String mThemeWp;
    private String mThemeNavbarStyle;

    public ThemeDbUtils() {
        //
    }

    public ThemeDbUtils(int id, String themeName, String themeDayOrNight, String themeNightColor,
                String themeSwitch, String adaptativeIconShape, String themeFont,
                String themeIconShape, String themeSbIcons, String themeWp, String themeNavbarStyle) {
        mId = id;
        mThemeName = themeName;
        mThemeDayOrNight = themeDayOrNight;
        mThemeNightColor = themeNightColor;
        mThemeSwitch = themeSwitch;
        mAdaptativeIconShape = adaptativeIconShape;
        mThemeFont = themeFont;
        mThemeIconShape = themeIconShape;
        mThemeSbIcons = themeSbIcons;
        mThemeWp = themeWp;
        mThemeNavbarStyle = themeNavbarStyle;
    }

    public ThemeDbUtils(String themeName, String themeDayOrNight, String themeNightColor,
                String themeSwitch, String adaptativeIconShape, String themeFont,
                String themeIconShape, String themeSbIcons, String themeWp, String themeNavbarStyle) {
        mThemeName = themeName;
        mThemeDayOrNight = themeDayOrNight;
        mThemeNightColor = themeNightColor;
        mThemeSwitch = themeSwitch;
        mAdaptativeIconShape = adaptativeIconShape;
        mThemeFont = themeFont;
        mThemeIconShape = themeIconShape;
        mThemeSbIcons = themeSbIcons;
        mThemeWp = themeWp;
        mThemeNavbarStyle = themeNavbarStyle;
    }

    public int getID() {
        return mId;
    }

    public void setID(int id) {
        mId = id;
    }

    public String getThemeName() {
        return mThemeName;
    }

    public void setThemeName(String themeName) {
        mThemeName = themeName;
    }

    public String getThemeDayOrNight() {
        return mThemeDayOrNight;
    }

    public void setThemeDayOrNight(String themeDayOrNight) {
        mThemeDayOrNight = themeDayOrNight;
    }

    public String getThemeNightColor() {
        return mThemeNightColor;
    }

    public void setThemeNightColor(String themeNightColor) {
        mThemeNightColor = themeNightColor;
    }

    public String getThemeSwitch() {
        return mThemeSwitch;
    }

    public void setThemeSwitch(String themeSwitch) {
        mThemeSwitch = themeSwitch;
    }

    public String getAdaptiveIconShape() {
        return mAdaptativeIconShape;
    }

    public void setAdaptiveIconShape(String adaptativeIconShape) {
        mAdaptativeIconShape = adaptativeIconShape;
    }

    public String getThemeFont() {
        return mThemeFont;
    }

    public void setThemeFont(String themeFont) {
        mThemeFont = themeFont;
    }

    public String getThemeIconShape() {
        return mThemeIconShape;
    }

    public void setThemeIconShape(String themeIconShape) {
        mThemeIconShape = themeIconShape;
    }

    public String getThemeSbIcons() {
        return mThemeSbIcons;
    }

    public void setThemeSbIcons(String themeSbIcons) {
        mThemeSbIcons = themeSbIcons;
    }

    public String getThemeWp() {
        return mThemeWp;
    }

    public void setThemeWp(String themeWp) {
        mThemeWp = themeWp;
    }

    public String getThemeNavbarStyle() {
        return mThemeNavbarStyle;
    }

    public void setThemeNavbarStyle(String themeNavbarStyle) {
        mThemeNavbarStyle = themeNavbarStyle;
    }
}
