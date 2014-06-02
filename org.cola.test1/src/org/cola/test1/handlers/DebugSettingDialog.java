package org.cola.test1.handlers;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class DebugSettingDialog extends Dialog {

	protected DebugSettingDialog(Shell parentShell) {
		super(parentShell);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		// TODO Auto-generated method stub
	    Composite area = (Composite) super.createDialogArea(parent);
	    Composite container = new Composite(area, SWT.NONE);
	    //create debugToolPath:
	    //create debugDevice:
	    //create scriptPath;
	    //create hardwareAdress(IP:PORT);
		return container;
	}


}
