/*    
    Copyright (C) Paul Falstad and Iain Sharp
    Added to Version 4 and modified by Vinyasi on 11/Mar/2018 23:11
    BTW, 'Differential Equations' button has had its name changed
    to 'More Information'.

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

public class AboutDiffEqBox extends PopupPanel {
	VerticalPanel vp;
	Button okButton;
	AboutDiffEqBox(String diffEqFile, String size) {
		super();
		if (diffEqFile == "" || diffEqFile == null) {
			return;
		} else {
			vp = new VerticalPanel();
			setWidget(vp);
			if (size == "small") {
				vp.setWidth("540px");
// image limits are 530 = width versus 470 = height
				vp.add(new HTML("<iframe src='circuitjs1/graphs/" + diffEqFile + "_.html' width='570' height='510'></iframe>"));
			} else if (size == "large") {
				vp.setWidth("1210px");
// image limits are 1200 = width versus 800 = height
				vp.add(new HTML("<iframe src='circuitjs1/graphs/" + diffEqFile + "_.html' width='1240' height='840'></iframe>"));
			}
			vp.add(okButton = new Button("CLOSE&nbsp;THIS&nbsp;WINDOW"));
			okButton.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					close();
				}
			});
			center();
			show();
		}
	}

	public void close() {
		hide();
	}
}
