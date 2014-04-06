package com.apple.eio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * Provides functionality to query and modify Mac-specific file attributes. The methods in this
 * class are based on Finder attributes. These attributes in turn are dependent on HFS and HFS+ file
 * systems. As such, it is important to recognize their limitation when writing code that must
 * function well across multiple platforms.
 * <p>
 * In addition to file name suffixes, Mac OS X can use Finder attributes like file <code>type</code>
 * and <code>creator</code> codes to identify and handle files. These codes are unique 4-byte
 * identifiers. The file <code>type</code> is a string that describes the contents of a file. For
 * example, the file type <code>APPL</code> identifies the file as an application and therefore
 * executable. A file type of <code>TEXT</code> means that the file contains raw text. Any
 * application that can read raw text can open a file of type <code>TEXT</code>. Applications that
 * use proprietary file types might assign their files a proprietary file <code>type</code> code.
 * <p>
 * To identify the application that can handle a document, the Finder can look at the
 * <code>creator</code>. For example, if a user double-clicks on a document with the
 * <code>ttxt</code> <code>creator</code>, it opens up in Text Edit, the application registered with
 * the <code>ttxt</code> <code>creator</code> code. Note that the <code>creator</code> code can be
 * set to any application, not necessarily the application that created it. For example, if you use
 * an editor to create an HTML document, you might want to assign a browser's <code>creator</code>
 * code for the file rather than the HTML editor's <code>creator</code> code. Double-clicking on the
 * document then opens the appropriate browser rather than the HTML editor.
 * <p>
 * If you plan to publicly distribute your application, you must register its creator and any
 * proprietary file types with the Apple Developer Connection to avoid collisions with codes used by
 * other developers. You can register a codes online at the <a target=_blank
 * href=http://developer.apple.com/dev/cftype/>Creator Code Registration</a> site.
 *
 * @since 1.4
 */
@SuppressWarnings("unused")
public class FileManager {
	/**
	 * The default
	 *
	 * @since Java for Mac OS X 10.5 - 1.5
	 * @since Java for Mac OS X 10.5 Update 1 - 1.6
	 */
	public final static short	kOnAppropriateDisk	= -32767;
	/**
	 * Read-only system hierarchy.
	 *
	 * @since Java for Mac OS X 10.5 - 1.5
	 * @since Java for Mac OS X 10.5 Update 1 - 1.6
	 */
	public final static short	kSystemDomain		= -32766;
	/**
	 * All users of a single machine have access to these resources.
	 *
	 * @since Java for Mac OS X 10.5 - 1.5
	 * @since Java for Mac OS X 10.5 Update 1 - 1.6
	 */
	public final static short	kLocalDomain		= -32765;
	/**
	 * All users configured to use a common network server has access to these resources.
	 *
	 * @since Java for Mac OS X 10.5 - 1.5
	 * @since Java for Mac OS X 10.5 Update 1 - 1.6
	 */
	public final static short	kNetworkDomain		= -32764;
	/**
	 * Read/write. Resources that are private to the user.
	 *
	 * @since Java for Mac OS X 10.5 - 1.5
	 * @since Java for Mac OS X 10.5 Update 1 - 1.6
	 */
	public final static short	kUserDomain			= -32763;

	/**
	 * Converts an OSType (e.g. "macs" from <CarbonCore/Folders.h>) into an int.
	 *
	 * @param type the 4 character type to convert.
	 * @return an int representing the 4 character value
	 * @since Java for Mac OS X 10.5 - 1.5
	 * @since Java for Mac OS X 10.5 Update 1 - 1.6
	 */
	public static int OSTypeToInt(String type) {
		return 0;
	}

	/**
	 * Sets the file <code>type</code> and <code>creator</code> codes for a file or folder.
	 *
	 * @since 1.4
	 */
	public static void setFileTypeAndCreator(String filename, int type, int creator) throws IOException {
		//
	}

	/**
	 * Sets the file <code>type</code> code for a file or folder.
	 *
	 * @since 1.4
	 */
	public static void setFileType(String filename, int type) throws IOException {
		//
	}

	/**
	 * Sets the file <code>creator</code> code for a file or folder.
	 *
	 * @since 1.4
	 */
	public static void setFileCreator(String filename, int creator) throws IOException {
		//
	}

	/**
	 * Obtains the file <code>type</code> code for a file or folder.
	 *
	 * @since 1.4
	 */
	public static int getFileType(String filename) throws IOException {
		return 0;
	}

	/**
	 * Obtains the file <code>creator</code> code for a file or folder.
	 *
	 * @since 1.4
	 */
	public static int getFileCreator(String filename) throws IOException {
		return 0;
	}

	/**
	 * Locates a folder of a particular type. Mac OS X recognizes certain specific folders that have
	 * distinct purposes. For example, the user's desktop or temporary folder. These folders have
	 * corresponding codes. Given one of these codes, this method returns the path to that
	 * particular folder. Certain folders of a given type may appear in more than one domain. For
	 * example, although there is only one <code>root</code> folder, there are multiple
	 * <code>pref</code> folders. If this method is called to find the <code>pref</code> folder, it
	 * will return the first one it finds, the user's preferences folder in
	 * <code>~/Library/Preferences</code>. To explicitly locate a folder in a certain domain use
	 * <code>findFolder(short domain, int folderType)</code> or
	 * <code>findFolder(short domain, int folderType,
	 * boolean createIfNeeded)</code>.
	 *
	 * @return the path to the folder searched for
	 * @since 1.4
	 */
	public static String findFolder(int folderType) throws FileNotFoundException {
		return null;
	}

	/**
	 * Locates a folder of a particular type, within a given domain. Similar to
	 * <code>findFolder(int folderType)</code> except that the domain to look in can be specified.
	 * Valid values for <code>domain</code>include:
	 * <dl>
	 * <dt>user</dt>
	 * <dd>The User domain contains resources specific to the user who is currently logged in</dd>
	 * <dt>local</dt>
	 * <dd>The Local domain contains resources shared by all users of the system but are not needed
	 * for the system itself to run.</dd>
	 * <dt>network</dt>
	 * <dd>The Network domain contains resources shared by users of a local area network.</dd>
	 * <dt>system</dt>
	 * <dd>The System domain contains the operating system resources installed by Apple.</dd>
	 * </dl>
	 *
	 * @return the path to the folder searched for
	 * @since 1.4
	 */
	public static String findFolder(short domain, int folderType) throws FileNotFoundException {
		return null;
	}

	/**
	 * Locates a folder of a particular type within a given domain and optionally creating the
	 * folder if it does not exist. The behavior is similar to
	 * <code>findFolder(int folderType)</code> and
	 * <code>findFolder(short domain, int folderType)</code> except that it can create the folder if
	 * it does not already exist.
	 *
	 * @param createIfNeeded set to <code>true</code>, by setting to <code>false</code> the behavior
	 *            will be the same as
	 *            <code>findFolder(short domain, int folderType, boolean createIfNeeded)</code>
	 * @return the path to the folder searched for
	 * @since 1.4
	 */
	public static String findFolder(short domain, int folderType, boolean createIfNeeded) throws FileNotFoundException {
		return null;
	}

	/**
	 * Opens the path specified by a URL in the appropriate application for that URL. HTTP URL's (
	 * <code>http://</code>) open in the default browser as set in the Internet pane of System
	 * Preferences. File (<code>file://</code>) and FTP URL's (<code>ftp://</code>) open in the
	 * Finder. Note that opening an FTP URL will prompt the user for where they want to save the
	 * downloaded file(s).
	 *
	 * @param url the URL for the file you want to open, it can either be an HTTP, FTP, or file url
	 * @deprecated this functionality has been superseded by java.awt.Desktop.browse() and
	 *             java.awt.Desktop.open()
	 * @since 1.4
	 */
	@Deprecated
	public static void openURL(String url) throws IOException {
		//
	}

	/**
	 * @return full pathname for the resource identified by a given name.
	 * @since 1.4
	 */
	public static String getResource(String resourceName) throws FileNotFoundException {
		return null;
	}

	/**
	 * @return full pathname for the resource identified by a given name and located in the
	 *         specified bundle subdirectory.
	 * @since 1.4
	 */
	public static String getResource(String resourceName, String subDirName) throws FileNotFoundException {
		return null;
	}

	/**
	 * Returns the full pathname for the resource identified by the given name and file extension
	 * and located in the specified bundle subdirectory. If extension is an empty string or null,
	 * the returned pathname is the first one encountered where the file name exactly matches name.
	 * If subpath is null, this method searches the top-level nonlocalized resource directory
	 * (typically Resources) and the top-level of any language-specific directories. For example,
	 * suppose you have a modern bundle and specify "Documentation" for the subpath parameter. This
	 * method would first look in the Contents/Resources/Documentation directory of the bundle,
	 * followed by the Documentation subdirectories of each language-specific .lproj directory. (The
	 * search order for the language-specific directories corresponds to the user's preferences.)
	 * This method does not recurse through any other subdirectories at any of these locations. For
	 * more details see the AppKit NSBundle documentation.
	 *
	 * @return full pathname for the resource identified by the given name and file extension and
	 *         located in the specified bundle subdirectory.
	 * @since 1.4
	 */
	public static String getResource(String resourceName, String subDirName, String type) throws FileNotFoundException {
		return null;
	}

	/**
	 * Obtains the path to the current application's NSBundle, may not return a valid path if Java
	 * was launched from the command line.
	 *
	 * @return full pathname of the NSBundle of the current application executable.
	 * @since Java for Mac OS X 10.5 Update 1 - 1.6
	 * @since Java for Mac OS X 10.5 Update 2 - 1.5
	 */
	public static String getPathToApplicationBundle() {
		return null;
	}

	/**
	 * Moves the specified file to the Trash
	 *
	 * @param file
	 * @return returns true if the NSFileManager successfully moved the file to the Trash.
	 * @throws FileNotFoundException
	 * @since Java for Mac OS X 10.6 Update 1 - 1.6
	 * @since Java for Mac OS X 10.5 Update 6 - 1.6, 1.5
	 */
	public static boolean moveToTrash(final File file) throws FileNotFoundException {
		return false;
	}

	/**
	 * Reveals the specified file in the Finder
	 *
	 * @param file the file to reveal
	 * @return returns true if the NSFileManager successfully revealed the file in the Finder.
	 * @throws FileNotFoundException
	 * @since Java for Mac OS X 10.6 Update 1 - 1.6
	 * @since Java for Mac OS X 10.5 Update 6 - 1.6, 1.5
	 */
	public static boolean revealInFinder(final File file) throws FileNotFoundException {
		return false;
	}
}
