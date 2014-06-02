package org.cola.test1.handlers;


import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

public class BuildSettingHandler extends AbstractHandler implements IHandler {

	@Override
    public Object execute(ExecutionEvent event) 
      throws ExecutionException {
        Shell shell = PlatformUI.getWorkbench().
                        getActiveWorkbenchWindow().getShell();
        
       BuidSettingDialog dialog = new BuidSettingDialog(shell);
       	if (dialog.open() == Window.OK) {
       	  //System.out.println(dialog.getComplierToolPath());
       	  //System.out.println(dialog.getArchFilePath());
       	}
              return null;
    }
}