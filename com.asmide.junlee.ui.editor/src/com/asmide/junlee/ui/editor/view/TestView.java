package com.asmide.junlee.ui.editor.view;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;

import com.asmide.junlee.ui.editor.ASMEditor;
import com.asmide.junlee.ui.editor.ASMEditorInput;

public class TestView extends ViewPart {
	public static final String ID = "com.asmide.junlee.ui.editor.testview";

	public TestView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		this.setTitle("View");
		Button button2 = new Button(parent,SWT.BUTTON_MASK);
		button2.setSize(PROP_TITLE,PROP_TITLE);
		button2.setText("creat project");
		button2.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
					
			 }
				
			
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		Button button1 = new Button(parent, SWT.BUTTON_MASK);
		button1.setSize(PROP_TITLE,PROP_TITLE);
		button1.setText("new editor");
		button1.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				 IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
				 System.out.println(myWorkspaceRoot.getProjects()[0]);
				try {
					getViewSite().getWorkbenchWindow().getActivePage()
							.openEditor(new ASMEditorInput(), ASMEditor.ID);
				} catch (PartInitException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

		});
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
