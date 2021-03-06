// Generated by view binder compiler. Do not edit!
package br.com.pibsantalucia.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.viewbinding.ViewBinding;
import br.com.pibsantalucia.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PastoralFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayoutPastoralMessage;

  @NonNull
  public final WebView pastoralWebView;

  @NonNull
  public final ContentLoadingProgressBar progressBarPastoral;

  @NonNull
  public final TextView textViewPastoralMessage;

  private PastoralFragmentBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraintLayoutPastoralMessage, @NonNull WebView pastoralWebView,
      @NonNull ContentLoadingProgressBar progressBarPastoral,
      @NonNull TextView textViewPastoralMessage) {
    this.rootView = rootView;
    this.constraintLayoutPastoralMessage = constraintLayoutPastoralMessage;
    this.pastoralWebView = pastoralWebView;
    this.progressBarPastoral = progressBarPastoral;
    this.textViewPastoralMessage = textViewPastoralMessage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PastoralFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PastoralFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.pastoral_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PastoralFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintLayoutPastoralMessage;
      ConstraintLayout constraintLayoutPastoralMessage = rootView.findViewById(id);
      if (constraintLayoutPastoralMessage == null) {
        break missingId;
      }

      id = R.id.pastoralWebView;
      WebView pastoralWebView = rootView.findViewById(id);
      if (pastoralWebView == null) {
        break missingId;
      }

      id = R.id.progressBarPastoral;
      ContentLoadingProgressBar progressBarPastoral = rootView.findViewById(id);
      if (progressBarPastoral == null) {
        break missingId;
      }

      id = R.id.textViewPastoralMessage;
      TextView textViewPastoralMessage = rootView.findViewById(id);
      if (textViewPastoralMessage == null) {
        break missingId;
      }

      return new PastoralFragmentBinding((ConstraintLayout) rootView,
          constraintLayoutPastoralMessage, pastoralWebView, progressBarPastoral,
          textViewPastoralMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
