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

@Name("torch::data::datasets::Dataset<torch::data::datasets::TensorDataset,torch::data::TensorExample>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorExampleDataset extends TensorExampleBatchDataset {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorExampleDataset(Pointer p) { super(p); }


  /** Returns the example at the given index. */
  public native @ByVal @Cast("torch::data::datasets::Dataset<torch::data::datasets::TensorDataset,torch::data::TensorExample>::ExampleType*") Example get(@Cast("size_t") long index);

  /** Returns a batch of data.
   *  The default implementation calls {@code get()} for every requested index
   *  in the batch. */
  public native @ByVal TensorExampleVector get_batch(@ByVal SizeTArrayRef request);
}
