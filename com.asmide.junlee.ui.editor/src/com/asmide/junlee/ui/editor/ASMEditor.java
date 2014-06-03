package com.asmide.junlee.ui.editor;

import org.eclipse.ui.editors.text.TextEditor;

public class ASMEditor extends TextEditor {
	public static final String ID = "com.asmide.junlee.ui.editor.ASMEditor";
	protected void initalizeEditor(){
		super.initializeEditor();
		setSourceViewerConfiguration(new ASMSourceViewerConfiguration());
		System.out.println("打开了我的editor");
	}
}
