package com.apple.eawt;

import com.apple.eawt.AppEvent.PrintFilesEvent;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * An implementor can respond to requests to print documents that the app has been registered to
 * handle.
 *
 * @see Application#setPrintFileHandler(PrintFilesHandler)
 * @since Java for Mac OS X 10.6 Update 3
 * @since Java for Mac OS X 10.5 Update 8
 */
public interface PrintFilesHandler {
	/**
	 * Called when the application is asked to print a list of files.
	 * 
	 * @param event the request to print a list of files.
	 */
	public void printFiles(final PrintFilesEvent event);
}
