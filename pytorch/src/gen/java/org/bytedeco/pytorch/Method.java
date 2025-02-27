// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// A method in a module, e.g. f in:
//
// class M(ScriptModule):
//   @script_method
//   def f(self, x):
//     ...
// Note: because Method/Module are exposed to python these
// classes use python method naming conventions
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Method extends IMethod {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Method(Pointer p) { super(p); }


  // the module that contains this method.
  public native @ByVal JitModule owner();
  public native void run(@ByRef IValueVector stack);

  public native @ByVal @Name("operator ()") IValue apply(
        @ByVal IValueVector stack,
        @Cast("const torch::jit::Kwargs*") @ByRef(nullValue = "torch::jit::Kwargs()") StringIValueMap kwargs);
  public native @ByVal @Name("operator ()") IValue apply(
        @ByVal IValueVector stack);

  // Run method async. Invocation on this function would invokes a JIT
  // interpreter that executes ops inline, one by one, on caller's thread. A
  // model can utilize async op, i.e. `fork`, to launch an asynchronous task
  // which will be launched on provided `taskLauncher`.

  public native @SharedPtr @ByVal Graph graph();

  public native @StdString BytePointer name();

  public native @Cast("size_t") long num_inputs();

  public native @ByRef GraphExecutor get_executor();

  public native @ByRef Function function();
}
