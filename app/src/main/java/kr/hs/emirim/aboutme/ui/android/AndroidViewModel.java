package kr.hs.emirim.aboutme.ui.android;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AndroidViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AndroidViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is android fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}