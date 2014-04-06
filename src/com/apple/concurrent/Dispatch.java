package com.apple.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/**
 * NOTE: This is a STUB and the real class only exists on the Mac OS X platform.
 * <p>
 * Factory for {@link Executor}s and {@link ExecutorService}s backed by libdispatch. Access is
 * controlled through the {@link Dispatch#getInstance()} method, because performed tasks occur on
 * threads owned by libdispatch. These threads are not owned by any particular AppContext or have
 * any specific context classloader installed.
 *
 * @since Java for Mac OS X 10.6 Update 2
 */
@SuppressWarnings("static-method")
public final class Dispatch {
	/** The priorities of the three default asynchronous queues. */
	public enum Priority {
		LOW, NORMAL, HIGH;
	}

	/**
	 * Factory method returns an instance of {@link Dispatch} if supported by the underlying
	 * operating system, and if the caller's security manager permits
	 * "canInvokeInSystemThreadGroup".
	 *
	 * @return a factory instance of {@link Dispatch}, or <code>null</code> if not available
	 */
	public static Dispatch getInstance() {
		return null;
	}

	private Dispatch() {
	}

	/**
	 * Creates an {@link Executor} that performs tasks asynchronously. The {@link Executor} cannot
	 * be shutdown, and enqueued {@link Runnable}s cannot be canceled. Passing <code>null</code>
	 * returns the {@link Priority#NORMAL} {@link Executor}.
	 *
	 * @param priority - the priority of the returned {@link Executor}
	 * @return an asynchronous {@link Executor}
	 */
	public Executor getAsyncExecutor(Priority priority) {
		return null;
	}

	/**
	 * Creates an {@link ExecutorService} that performs tasks synchronously in FIFO order. Useful to
	 * protect a resource against concurrent modification, in lieu of a lock. Passing
	 * <code>null</code> returns an {@link ExecutorService} with a uniquely labeled queue.
	 *
	 * @param label - a label to name the queue, shown in several debugging tools
	 * @return a synchronous {@link ExecutorService}
	 */
	public ExecutorService createSerialExecutor(String label) {
		return null;
	}

	/**
	 * Returns an {@link Executor} that performs the provided {@link Runnable}s on the main queue of
	 * the process. {@link Runnable}s submitted to this {@link Executor} will not run until the AWT
	 * is started or another native toolkit is running a CFRunLoop or NSRunLoop on the main thread.
	 * Submitting a {@link Runnable} to this {@link Executor} does not wait for the {@link Runnable}
	 * to complete.
	 *
	 * @return an asynchronous {@link Executor} that is backed by the main queue
	 */
	public synchronized Executor getNonBlockingMainQueueExecutor() {
		return null;
	}

	/**
	 * Returns an {@link Executor} that performs the provided {@link Runnable}s on the main queue of
	 * the process. {@link Runnable}s submitted to this {@link Executor} will not run until the AWT
	 * is started or another native toolkit is running a CFRunLoop or NSRunLoop on the main thread.
	 * Submitting a {@link Runnable} to this {@link Executor} will block until the {@link Runnable}
	 * has completed.
	 *
	 * @return an {@link Executor} that is backed by the main queue
	 */
	public synchronized Executor getBlockingMainQueueExecutor() {
		return null;
	}
}
