package org.cola.test1.handlers;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

/**
 * Save file as...
 */
public class SaveAs extends AbstractHandler implements IHandler {

    @Override
    public Object execute(ExecutionEvent event) 
      throws ExecutionException {
        Shell shell = PlatformUI.getWorkbench().
                        getActiveWorkbenchWindow().getShell();

        FileDialog dialog = new FileDialog(shell, SWT.SAVE);
        dialog.setFilterExtensions(new String[] {"*.txt", "*.*"});
        dialog.setFilterNames(new String[] {"Text File", "All Files"});
        String fileSelected = dialog.open();

        if (fileSelected != null) {
           // Perform Action, like save the file.
          System.out.println("Selected file: " + fileSelected);
        }
        return null;
    }
}