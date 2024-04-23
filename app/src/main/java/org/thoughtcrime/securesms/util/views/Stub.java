package org.thoughtcrime.securesms.util.views;


import android.view.View;
import android.view.ViewStub;

import androidx.annotation.NonNull;

//This class is named Stub and is used as a utility for working with ViewStub objects in Android.
//The class is declared with a generic type parameter T, which extends View. This allows the class to work with any subclass of View.
public class Stub<T extends View> {

  //This is a private field of type ViewStub which holds a reference to the ViewStub object associated with this Stub.
  private ViewStub viewStub;

  //This is a private field of type T (a subclass of View) which holds a reference to the inflated view. It is initially null.
  private T        view;

  //The class has a constructor that takes a ViewStub as a parameter. It initializes the viewStub field with the provided ViewStub.
  public Stub(@NonNull ViewStub viewStub) {
    this.viewStub = viewStub;
  }

  // Returns the ID of the ViewStub or the inflated view if it has already been inflated.
  public int getId() {
    return (viewStub != null) ? viewStub.getId() : view.getId();
  }

  //Inflates the ViewStub if it hasn't been inflated yet and returns the inflated view. Subsequent calls will return the cached inflated view.
  public T get() {
    //nếu view không có giá trị thì lấy giá tri cũa viewStub inflate bỏ vào cho view rồi huỷ viewStub
    if (view == null) {
      //noinspection unchecked
      view     = (T) viewStub.inflate();
      viewStub = null;
    }

    return view;
  }

  public boolean resolved() {
    return view != null;
  }

  public void setVisibility(int visibility) {
    if (resolved() || visibility == View.VISIBLE) {
      get().setVisibility(visibility);
    }
  }

  public int getVisibility() {
    if (resolved()) {
      return get().getVisibility();
    } else {
      return View.GONE;
    }
  }

  public boolean isVisible() {
    return getVisibility() == View.VISIBLE;
  }

}
