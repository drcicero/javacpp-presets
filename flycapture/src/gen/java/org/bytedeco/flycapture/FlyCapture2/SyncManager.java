// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


	@Platform(not = "linux-arm") @Namespace("MultiSyncLibrary") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class SyncManager extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public SyncManager(Pointer p) { super(p); }
	    /** Native array allocator. Access with {@link Pointer#position(long)}. */
	    public SyncManager(long size) { super((Pointer)null); allocateArray(size); }
	    private native void allocateArray(long size);
	    @Override public SyncManager position(long position) {
	        return (SyncManager)super.position(position);
	    }
	    @Override public SyncManager getPointer(long i) {
	        return new SyncManager((Pointer)this).offsetAddress(i);
	    }
	
			public SyncManager() { super((Pointer)null); allocate(); }
			@Platform(not = "linux-arm") private native void allocate();
			public native @Cast("MultiSyncLibrary::PGRSyncError") int Start();
			public native @Cast("MultiSyncLibrary::PGRSyncError") int Stop();
			public native @Cast("MultiSyncLibrary::PGRSyncError") int RescanMasterTimingBus();
			public native @Cast("MultiSyncLibrary::PGRSyncMessage") int GetSyncStatus();
			public native double GetTimeSinceSynced();
			public native @Cast("bool") boolean IsTimingBusConnected();
			public native @Cast("bool") boolean EnableCrossPCSynchronization();
			public native @Cast("bool") boolean DisableCrossPCSynchronization();
			public native @Cast("bool") boolean QueryCrossPCSynchronizationSetting();
	}
