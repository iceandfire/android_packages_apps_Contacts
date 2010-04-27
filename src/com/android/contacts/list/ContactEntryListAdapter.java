/*
 * Copyright (C) 2010 The Android Open Source Project
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
package com.android.contacts.list;

import com.android.contacts.widget.TextWithHighlighting;
import com.android.contacts.widget.TextWithHighlightingFactory;

import android.content.Context;

/**
 * Common base class for various contact-related lists, e.g. contact list, phone number list
 * etc.
 */
public abstract class ContactEntryListAdapter extends PinnedHeaderListAdapter {

    /**
     * The animation is used here to allocate animated name text views.
     */
    private TextWithHighlightingFactory mTextWithHighlightingFactory;

    private boolean mNameHighlightingEnabled;

    public ContactEntryListAdapter(Context context) {
        super(context);
    }

    public Context getContext() {
        return mContext;
    }

    public void setNameHighlightingEnabled(boolean flag) {
        mNameHighlightingEnabled = flag;
    }

    public boolean isNameHighlightingEnabled() {
        return mNameHighlightingEnabled;
    }

    public void setTextWithHighlightingFactory(TextWithHighlightingFactory factory) {
        mTextWithHighlightingFactory = factory;
    }

    protected TextWithHighlighting createTextWithHighlighting() {
        return mTextWithHighlightingFactory.createTextWithHighlighting();
    }

    /*
     * TODO change this method when loaders are introduced.
     */
    @Override
    @Deprecated
    public void onContentChanged() {
        super.onContentChanged();
    }
}