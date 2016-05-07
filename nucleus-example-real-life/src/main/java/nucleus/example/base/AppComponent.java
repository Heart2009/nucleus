package nucleus.example.base;

import javax.inject.Singleton;

import dagger.Component;
import nucleus.example.item.ItemPresenter;
import nucleus.example.main.MainPresenter;

@Singleton
@Component(modules = NetworkModule.class)
public interface AppComponent {
    void inject(MainPresenter x);
    void inject(ItemPresenter x);
}