// Generated by view binder compiler. Do not edit!
package br.com.pibsantalucia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import br.com.pibsantalucia.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityForgotPasswordBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final AppCompatButton buttonForgotPasswordSend;

  @NonNull
  public final ImageButton imageButtonForgotPasswordBack;

  @NonNull
  public final TextInputEditText textInputEditTextForgotPasswordEmail;

  @NonNull
  public final TextInputLayout textInputLayoutForgotPasswordEmail;

  @NonNull
  public final TextView textViewForgotPasswordTitle;

  @NonNull
  public final TextView textViewForgotPasswordTitleInfo;

  private ActivityForgotPasswordBinding(@NonNull ScrollView rootView,
      @NonNull AppCompatButton buttonForgotPasswordSend,
      @NonNull ImageButton imageButtonForgotPasswordBack,
      @NonNull TextInputEditText textInputEditTextForgotPasswordEmail,
      @NonNull TextInputLayout textInputLayoutForgotPasswordEmail,
      @NonNull TextView textViewForgotPasswordTitle,
      @NonNull TextView textViewForgotPasswordTitleInfo) {
    this.rootView = rootView;
    this.buttonForgotPasswordSend = buttonForgotPasswordSend;
    this.imageButtonForgotPasswordBack = imageButtonForgotPasswordBack;
    this.textInputEditTextForgotPasswordEmail = textInputEditTextForgotPasswordEmail;
    this.textInputLayoutForgotPasswordEmail = textInputLayoutForgotPasswordEmail;
    this.textViewForgotPasswordTitle = textViewForgotPasswordTitle;
    this.textViewForgotPasswordTitleInfo = textViewForgotPasswordTitleInfo;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityForgotPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityForgotPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_forgot_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityForgotPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonForgotPasswordSend;
      AppCompatButton buttonForgotPasswordSend = rootView.findViewById(id);
      if (buttonForgotPasswordSend == null) {
        break missingId;
      }

      id = R.id.imageButtonForgotPasswordBack;
      ImageButton imageButtonForgotPasswordBack = rootView.findViewById(id);
      if (imageButtonForgotPasswordBack == null) {
        break missingId;
      }

      id = R.id.textInputEditTextForgotPasswordEmail;
      TextInputEditText textInputEditTextForgotPasswordEmail = rootView.findViewById(id);
      if (textInputEditTextForgotPasswordEmail == null) {
        break missingId;
      }

      id = R.id.textInputLayoutForgotPasswordEmail;
      TextInputLayout textInputLayoutForgotPasswordEmail = rootView.findViewById(id);
      if (textInputLayoutForgotPasswordEmail == null) {
        break missingId;
      }

      id = R.id.textViewForgotPasswordTitle;
      TextView textViewForgotPasswordTitle = rootView.findViewById(id);
      if (textViewForgotPasswordTitle == null) {
        break missingId;
      }

      id = R.id.textViewForgotPasswordTitleInfo;
      TextView textViewForgotPasswordTitleInfo = rootView.findViewById(id);
      if (textViewForgotPasswordTitleInfo == null) {
        break missingId;
      }

      return new ActivityForgotPasswordBinding((ScrollView) rootView, buttonForgotPasswordSend,
          imageButtonForgotPasswordBack, textInputEditTextForgotPasswordEmail,
          textInputLayoutForgotPasswordEmail, textViewForgotPasswordTitle,
          textViewForgotPasswordTitleInfo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
