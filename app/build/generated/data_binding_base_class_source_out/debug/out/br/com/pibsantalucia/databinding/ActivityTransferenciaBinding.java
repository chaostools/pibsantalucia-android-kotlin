// Generated by view binder compiler. Do not edit!
package br.com.pibsantalucia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import br.com.pibsantalucia.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import mk.webfactory.dz.maskededittext.MaskedEditText;

public final class ActivityTransferenciaBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final CircleImageView circularImageViewPhotoTransferencia;

  @NonNull
  public final ConstraintLayout constraintLayoutReference1;

  @NonNull
  public final MaskedEditText editTextTransferenciaDate;

  @NonNull
  public final AppCompatRadioButton radioButtonTransferenciaE;

  @NonNull
  public final AppCompatRadioButton radioButtonTransferenciaS;

  @NonNull
  public final RadioGroup radioGroupTransferenciaStatus;

  @NonNull
  public final TextInputEditText textInputEditTextTransferenciaIgreja;

  @NonNull
  public final TextInputEditText textInputEditTextTransferenciaMotivo;

  @NonNull
  public final TextInputEditText textInputEditTextTransferenciaObs;

  @NonNull
  public final TextInputLayout textInputLayoutTransferenciaDate;

  @NonNull
  public final TextInputLayout textInputLayoutTransferenciaIgreja;

  @NonNull
  public final TextInputLayout textInputLayoutTransferenciaMotivo;

  @NonNull
  public final TextInputLayout textInputLayoutTransferenciaObs;

  @NonNull
  public final TextView textViewNameTransferencia;

  @NonNull
  public final TextView textViewNameTransferenciaStatus;

  private ActivityTransferenciaBinding(@NonNull ScrollView rootView,
      @NonNull CircleImageView circularImageViewPhotoTransferencia,
      @NonNull ConstraintLayout constraintLayoutReference1,
      @NonNull MaskedEditText editTextTransferenciaDate,
      @NonNull AppCompatRadioButton radioButtonTransferenciaE,
      @NonNull AppCompatRadioButton radioButtonTransferenciaS,
      @NonNull RadioGroup radioGroupTransferenciaStatus,
      @NonNull TextInputEditText textInputEditTextTransferenciaIgreja,
      @NonNull TextInputEditText textInputEditTextTransferenciaMotivo,
      @NonNull TextInputEditText textInputEditTextTransferenciaObs,
      @NonNull TextInputLayout textInputLayoutTransferenciaDate,
      @NonNull TextInputLayout textInputLayoutTransferenciaIgreja,
      @NonNull TextInputLayout textInputLayoutTransferenciaMotivo,
      @NonNull TextInputLayout textInputLayoutTransferenciaObs,
      @NonNull TextView textViewNameTransferencia,
      @NonNull TextView textViewNameTransferenciaStatus) {
    this.rootView = rootView;
    this.circularImageViewPhotoTransferencia = circularImageViewPhotoTransferencia;
    this.constraintLayoutReference1 = constraintLayoutReference1;
    this.editTextTransferenciaDate = editTextTransferenciaDate;
    this.radioButtonTransferenciaE = radioButtonTransferenciaE;
    this.radioButtonTransferenciaS = radioButtonTransferenciaS;
    this.radioGroupTransferenciaStatus = radioGroupTransferenciaStatus;
    this.textInputEditTextTransferenciaIgreja = textInputEditTextTransferenciaIgreja;
    this.textInputEditTextTransferenciaMotivo = textInputEditTextTransferenciaMotivo;
    this.textInputEditTextTransferenciaObs = textInputEditTextTransferenciaObs;
    this.textInputLayoutTransferenciaDate = textInputLayoutTransferenciaDate;
    this.textInputLayoutTransferenciaIgreja = textInputLayoutTransferenciaIgreja;
    this.textInputLayoutTransferenciaMotivo = textInputLayoutTransferenciaMotivo;
    this.textInputLayoutTransferenciaObs = textInputLayoutTransferenciaObs;
    this.textViewNameTransferencia = textViewNameTransferencia;
    this.textViewNameTransferenciaStatus = textViewNameTransferenciaStatus;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTransferenciaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTransferenciaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_transferencia, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTransferenciaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.circularImageViewPhotoTransferencia;
      CircleImageView circularImageViewPhotoTransferencia = rootView.findViewById(id);
      if (circularImageViewPhotoTransferencia == null) {
        break missingId;
      }

      id = R.id.constraintLayoutReference1;
      ConstraintLayout constraintLayoutReference1 = rootView.findViewById(id);
      if (constraintLayoutReference1 == null) {
        break missingId;
      }

      id = R.id.editTextTransferenciaDate;
      MaskedEditText editTextTransferenciaDate = rootView.findViewById(id);
      if (editTextTransferenciaDate == null) {
        break missingId;
      }

      id = R.id.radioButtonTransferenciaE;
      AppCompatRadioButton radioButtonTransferenciaE = rootView.findViewById(id);
      if (radioButtonTransferenciaE == null) {
        break missingId;
      }

      id = R.id.radioButtonTransferenciaS;
      AppCompatRadioButton radioButtonTransferenciaS = rootView.findViewById(id);
      if (radioButtonTransferenciaS == null) {
        break missingId;
      }

      id = R.id.radioGroupTransferenciaStatus;
      RadioGroup radioGroupTransferenciaStatus = rootView.findViewById(id);
      if (radioGroupTransferenciaStatus == null) {
        break missingId;
      }

      id = R.id.textInputEditTextTransferenciaIgreja;
      TextInputEditText textInputEditTextTransferenciaIgreja = rootView.findViewById(id);
      if (textInputEditTextTransferenciaIgreja == null) {
        break missingId;
      }

      id = R.id.textInputEditTextTransferenciaMotivo;
      TextInputEditText textInputEditTextTransferenciaMotivo = rootView.findViewById(id);
      if (textInputEditTextTransferenciaMotivo == null) {
        break missingId;
      }

      id = R.id.textInputEditTextTransferenciaObs;
      TextInputEditText textInputEditTextTransferenciaObs = rootView.findViewById(id);
      if (textInputEditTextTransferenciaObs == null) {
        break missingId;
      }

      id = R.id.textInputLayoutTransferenciaDate;
      TextInputLayout textInputLayoutTransferenciaDate = rootView.findViewById(id);
      if (textInputLayoutTransferenciaDate == null) {
        break missingId;
      }

      id = R.id.textInputLayoutTransferenciaIgreja;
      TextInputLayout textInputLayoutTransferenciaIgreja = rootView.findViewById(id);
      if (textInputLayoutTransferenciaIgreja == null) {
        break missingId;
      }

      id = R.id.textInputLayoutTransferenciaMotivo;
      TextInputLayout textInputLayoutTransferenciaMotivo = rootView.findViewById(id);
      if (textInputLayoutTransferenciaMotivo == null) {
        break missingId;
      }

      id = R.id.textInputLayoutTransferenciaObs;
      TextInputLayout textInputLayoutTransferenciaObs = rootView.findViewById(id);
      if (textInputLayoutTransferenciaObs == null) {
        break missingId;
      }

      id = R.id.textViewNameTransferencia;
      TextView textViewNameTransferencia = rootView.findViewById(id);
      if (textViewNameTransferencia == null) {
        break missingId;
      }

      id = R.id.textViewNameTransferenciaStatus;
      TextView textViewNameTransferenciaStatus = rootView.findViewById(id);
      if (textViewNameTransferenciaStatus == null) {
        break missingId;
      }

      return new ActivityTransferenciaBinding((ScrollView) rootView,
          circularImageViewPhotoTransferencia, constraintLayoutReference1,
          editTextTransferenciaDate, radioButtonTransferenciaE, radioButtonTransferenciaS,
          radioGroupTransferenciaStatus, textInputEditTextTransferenciaIgreja,
          textInputEditTextTransferenciaMotivo, textInputEditTextTransferenciaObs,
          textInputLayoutTransferenciaDate, textInputLayoutTransferenciaIgreja,
          textInputLayoutTransferenciaMotivo, textInputLayoutTransferenciaObs,
          textViewNameTransferencia, textViewNameTransferenciaStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}