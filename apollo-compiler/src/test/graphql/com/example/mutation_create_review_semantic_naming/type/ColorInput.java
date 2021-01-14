// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.mutation_create_review_semantic_naming.type;

import com.homer.apollographql.apollo.api.Input;
import com.homer.apollographql.apollo.api.InputType;
import com.homer.apollographql.apollo.api.internal.InputFieldMarshaller;
import com.homer.apollographql.apollo.api.internal.InputFieldWriter;
import com.homer.apollographql.apollo.api.internal.Utils;
import java.io.IOException;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ColorInput implements InputType {
  private final int red;

  private final Input<Double> green;

  private final double blue;

  private final Input<Episode> enumWithDefaultValue;

  private final Input<ReviewRefInput> reviewRefInput;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  ColorInput(int red, Input<Double> green, double blue, Input<Episode> enumWithDefaultValue,
      Input<ReviewRefInput> reviewRefInput) {
    this.red = red;
    this.green = green;
    this.blue = blue;
    this.enumWithDefaultValue = enumWithDefaultValue;
    this.reviewRefInput = reviewRefInput;
  }

  /**
   * Red color
   */
  public int red() {
    return this.red;
  }

  /**
   * Green color
   */
  public @Nullable Double green() {
    return this.green.value;
  }

  /**
   * Blue color
   */
  public double blue() {
    return this.blue;
  }

  /**
   * for test purpose only
   */
  public @Nullable Episode enumWithDefaultValue() {
    return this.enumWithDefaultValue.value;
  }

  /**
   * Circle ref to review input
   */
  public @Nullable ReviewRefInput reviewRefInput() {
    return this.reviewRefInput.value;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public InputFieldMarshaller marshaller() {
    return new InputFieldMarshaller() {
      @Override
      public void marshal(InputFieldWriter writer) throws IOException {
        writer.writeInt("red", red);
        if (green.defined) {
          writer.writeDouble("green", green.value);
        }
        writer.writeDouble("blue", blue);
        if (enumWithDefaultValue.defined) {
          writer.writeString("enumWithDefaultValue", enumWithDefaultValue.value != null ? enumWithDefaultValue.value.rawValue() : null);
        }
        if (reviewRefInput.defined) {
          writer.writeObject("reviewRefInput", reviewRefInput.value != null ? reviewRefInput.value.marshaller() : null);
        }
      }
    };
  }

  @Override
  public int hashCode() {
    if (!$hashCodeMemoized) {
      int h = 1;
      h *= 1000003;
      h ^= red;
      h *= 1000003;
      h ^= green.hashCode();
      h *= 1000003;
      h ^= Double.valueOf(blue).hashCode();
      h *= 1000003;
      h ^= enumWithDefaultValue.hashCode();
      h *= 1000003;
      h ^= reviewRefInput.hashCode();
      $hashCode = h;
      $hashCodeMemoized = true;
    }
    return $hashCode;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ColorInput) {
      ColorInput that = (ColorInput) o;
      return this.red == that.red
       && this.green.equals(that.green)
       && Double.doubleToLongBits(this.blue) == Double.doubleToLongBits(that.blue)
       && this.enumWithDefaultValue.equals(that.enumWithDefaultValue)
       && this.reviewRefInput.equals(that.reviewRefInput);
    }
    return false;
  }

  public static final class Builder {
    private int red = 1;

    private Input<Double> green = Input.fromNullable(0.0);

    private double blue = 1.5;

    private Input<Episode> enumWithDefaultValue = Input.fromNullable(Episode.safeValueOf("new"));

    private Input<ReviewRefInput> reviewRefInput = Input.absent();

    Builder() {
    }

    /**
     * Red color
     */
    public Builder red(int red) {
      this.red = red;
      return this;
    }

    /**
     * Green color
     */
    public Builder green(@Nullable Double green) {
      this.green = Input.fromNullable(green);
      return this;
    }

    /**
     * Blue color
     */
    public Builder blue(double blue) {
      this.blue = blue;
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder enumWithDefaultValue(@Nullable Episode enumWithDefaultValue) {
      this.enumWithDefaultValue = Input.fromNullable(enumWithDefaultValue);
      return this;
    }

    /**
     * Circle ref to review input
     */
    public Builder reviewRefInput(@Nullable ReviewRefInput reviewRefInput) {
      this.reviewRefInput = Input.fromNullable(reviewRefInput);
      return this;
    }

    /**
     * Green color
     */
    public Builder greenInput(@NotNull Input<Double> green) {
      this.green = Utils.checkNotNull(green, "green == null");
      return this;
    }

    /**
     * for test purpose only
     */
    public Builder enumWithDefaultValueInput(@NotNull Input<Episode> enumWithDefaultValue) {
      this.enumWithDefaultValue = Utils.checkNotNull(enumWithDefaultValue, "enumWithDefaultValue == null");
      return this;
    }

    /**
     * Circle ref to review input
     */
    public Builder reviewRefInputInput(@NotNull Input<ReviewRefInput> reviewRefInput) {
      this.reviewRefInput = Utils.checkNotNull(reviewRefInput, "reviewRefInput == null");
      return this;
    }

    public ColorInput build() {
      return new ColorInput(red, green, blue, enumWithDefaultValue, reviewRefInput);
    }
  }
}
