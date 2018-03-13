/*    
    Copyright (C) Paul Falstad and Iain Sharp
    Added to Version 4 by Vinyasi on 11/Mar/2018 23:11

// Mod.Begin
// Mod.End
    
    This file is part of Vinyasi's port of CircuitJS1 specializing in
    Surge Circuits exhibiting Pure Resonance. See, Prof. Arthur Mattuck
    on YouTube and MIT Open Course Ware.

    CircuitJS1 is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 2 of the License, or
    (at your option) any later version.

    CircuitJS1 is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with CircuitJS1.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.lushprojects.circuitjs1.client;

import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseWheelEvent;
import com.google.gwt.event.dom.client.MouseWheelHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Button;

public class LegendBox extends PopupPanel {
	
	VerticalPanel vp;
	Button okButton;
	
	LegendBox() {
		super();
		vp = new VerticalPanel();
		setWidget(vp);
		vp.setWidth("370px");
		vp.add(new HTML("<p><span style='color:red'>The Following Symbols are Sometimes Placed Before the Name of a " +
		"Circuit to Indicate ...</span></p>" +
		"<p><b><big><big>&Theta;</big></big> 90&deg; Phase Relation</b> &ndash; Amperage is Out of Phase with Voltage " +
		"by Ninety Degrees.</p>" +
		"<p><b><big><big><big><big>*</big></big></big></big> Mild Reciprocal Resistance</b> &ndash; Mild Change in either Amperage or Voltage " +
		"on the Oscilloscope.</p>" +
// SNOWFLAKE UNICODE
// &# 10052 ;
// REMOVE THE TWO SPACES TO CREATE THIS SYMBOL
		"<p><b><big>&#10052;</big> Distinct Reciprocal Resistance</b> &ndash; Sharp Change in either Amperage or " +
		"Voltage on the Oscilloscope.</p>" +
		"<p><b><big><big><big><big>&infin;</big></big></big></big> Output Exceeds Input</b> &ndash; Overunity and Free " +
		"Energy.</p>" +
		"<p><b><big><big>#</big></big> Instantaneous KABOOM!</b> &ndash; Surge Circuits which Rise to Infinite Gain " +
		"VERY Quickly.</p>" +
		"<p><b><big>@</big> Circuit Information</b> &ndash; Button in the Upper Right-Hand Corner for some " +
		"Circuits.</p>" +
		"<p><b><big>%</big> Circuit Information</b> &ndash; With a Larger Window.</p>" +
		"<br />"));

		vp.add(okButton = new Button("CLOSE&nbsp;THIS&nbsp;WINDOW"));
		okButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				close();
			}
		});
		center();
		show();
	}

	public void close() {
		hide();
	}
}
