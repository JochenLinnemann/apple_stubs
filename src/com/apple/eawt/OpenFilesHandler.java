package com.apple.eawt;

import com.apple.eawt.AppEvent.OpenFilesEvent;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * An implementor is notified when the application is asked to open a list of files. This message is
 * only sent if the application has registered that it handles CFBundleDocumentTypes in it's
 * Info.plist.
 *
 * @see Application#setOpenFileHandler(OpenFilesHandler)
 * @since Java for Mac OS X 10.6 Update 3
 * @since Java for Mac OS X 10.5 Update 8
 */
public interface OpenFilesHandler {
	/**
	 * Called when the application is asked to open a list of files.
	 * 
	 * @param event the request to open a list of files, and the search term used to find them, if
	 *            any.
	 */
	public void openFiles(final OpenFilesEvent event);
}
