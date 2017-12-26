/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matheus.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.iron.IronIconElement;
import com.vaadin.polymer.paper.*;


import java.util.Arrays;

/**
 * Main entry point.
 *
 * @author matheus
 */
public class MainEntryPoint implements EntryPoint {

    /**
     * Creates a new instance of MainEntryPoint
     */
    public MainEntryPoint() {
    }

    /**
     * The entry point method, called automatically by loading a module that
     * declares an implementing class as an entry-point
     */
//    public void onModuleLoad() {
//        final Label label = new Label("Hello, GWT!!!");
//        final Button button = new Button("Click me!");
//        
//        button.addClickHandler(new ClickHandler() {
//            public void onClick(ClickEvent event) {
//                label.setVisible(!label.isVisible());
//            }
//        });
//        
//        RootPanel.get().add(button);
//        RootPanel.get().add(label);
//    }
    //  usando Widget UI
//    public void onModuleLoad() {
//        // We have to load icon sets before run application
//        Polymer.importHref("iron-icons/iron-icons.html", new Function() {
//            public Object call(Object arg) {
//                // The app is executed when all imports succeed.
//                startApplication();
//                return null;
//            }
//        });
//      }
//
//      private void startApplication() {
//        RootPanel.get().add(new Main());
//      }
    
    //  Usando Elements UI
     public void onModuleLoad() {
        Polymer.importHref(Arrays.asList(
                "iron-icons/iron-icons.html",
                PaperIconItemElement.SRC,
                PaperRippleElement.SRC,
                IronIconElement.SRC,
                PaperDrawerPanelElement.SRC,
                PaperHeaderPanelElement.SRC,
                PaperToolbarElement.SRC,
                PaperFabElement.SRC,
                PaperDialogElement.SRC,
                PaperTextareaElement.SRC,
                PaperInputElement.SRC,
                PaperButtonElement.SRC,
                PaperCheckboxElement.SRC
        ), new Function() {
            public Object call(Object arg) {
                startApplication();
                return null;
            }
        });

    }

    private void startApplication() {
        RootPanel.get().add(new Main());
    }
}
