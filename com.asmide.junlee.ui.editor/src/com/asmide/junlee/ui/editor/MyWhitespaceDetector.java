package com.asmide.junlee.ui.editor;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

public class MyWhitespaceDetector implements IWhitespaceDetector {

	@Override
	public boolean isWhitespace(char c) {
		// TODO Auto-generated method stub
		return Character.isWhitespace(c);
	}

}
