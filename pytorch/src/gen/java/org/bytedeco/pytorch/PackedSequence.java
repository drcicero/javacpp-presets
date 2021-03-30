// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** Holds the data and list of {@code batch_sizes} of a packed sequence.
 *  
 *  All RNN modules accept packed sequences as inputs.
 *  
 *  Note:
 *      Instances of this class should never be created manually. They are meant
 *      to be instantiated by functions like {@code pack_padded_sequence}.
 *  
 *      Batch sizes represent the number elements at each sequence step in
 *      the batch, not the varying sequence lengths passed to
 *      {@code pack_padded_sequence}.  For instance, given data {@code }abc{@code } and {@code }x{@code }
 *      the :class:{@code PackedSequence} would contain data {@code }axbc{@code } with
 *      {@code }batch_sizes=[2,1,1]{@code }.
 *  
 *  Attributes:
 *      data (Tensor): Tensor containing packed sequence
 *      batch_sizes (Tensor): Tensor of integers holding
 *          information about the batch size at each sequence step
 *      sorted_indices (Tensor, optional): Tensor of integers holding how this
 *          :class:{@code PackedSequence} is constructed from sequences.
 *      unsorted_indices (Tensor, optional): Tensor of integers holding how this
 *          to recover the original sequences with correct order.
 *  
 *  .. note::
 *      {@code data} can be on arbitrary device and of arbitrary dtype.
 *      {@code sorted_indices} and {@code unsorted_indices} must be {@code }torch::kInt64{@code }
 *      tensors on the same device as {@code data}.
 *  
 *      However, {@code batch_sizes} should always be a CPU {@code }torch::kInt64{@code } tensor.
 *  
 *      This invariant is maintained throughout {@code PackedSequence} class,
 *      and all functions that construct a {@code PackedSequence} in libtorch
 *      (i.e., they only pass in tensors conforming to this constraint). */
@Namespace("torch::nn::utils::rnn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PackedSequence extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PackedSequence(Pointer p) { super(p); }

  public PackedSequence(
        @ByVal Tensor data,
        @ByVal Tensor batch_sizes,
        @ByVal(nullValue = "at::Tensor{}") Tensor sorted_indices,
        @ByVal(nullValue = "at::Tensor{}") Tensor unsorted_indices) { super((Pointer)null); allocate(data, batch_sizes, sorted_indices, unsorted_indices); }
  private native void allocate(
        @ByVal Tensor data,
        @ByVal Tensor batch_sizes,
        @ByVal(nullValue = "at::Tensor{}") Tensor sorted_indices,
        @ByVal(nullValue = "at::Tensor{}") Tensor unsorted_indices);
  public PackedSequence(
        @ByVal Tensor data,
        @ByVal Tensor batch_sizes) { super((Pointer)null); allocate(data, batch_sizes); }
  private native void allocate(
        @ByVal Tensor data,
        @ByVal Tensor batch_sizes);

  public native @Const @ByRef Tensor data();

  public native @Const @ByRef Tensor batch_sizes();

  public native @Const @ByRef Tensor sorted_indices();

  public native @Const @ByRef Tensor unsorted_indices();

  public native @ByVal PackedSequence pin_memory();

  public native @ByVal PackedSequence to(@ByVal TensorOptions options);

  public native @ByVal PackedSequence cuda();

  public native @ByVal PackedSequence cpu();

  /** Returns true if {@code data_} stored on a gpu */
  public native @Cast("bool") boolean is_cuda();

  /** Returns true if {@code data_} stored on in pinned memory */
  public native @Cast("bool") boolean is_pinned();
}