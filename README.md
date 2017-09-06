# MVP-Android-Base
This is my starting point for Android MVP

This project is my baseline for all new Android apps. It comes pre-built with many dependencies android devs find themselves using, such as

Dagger
Retrofit
Picasso
... and much more!

Further, there are many dependencies commented out in the gradle file that one might need, making it convient to re-add once needed.

Currently the application is building using the Model-View-Presenter and has all base classes/interfaces implemented and working out of the box for the MainActivity.
The presenter is injected into each Activity via dagger, where other components can be extended/created following my scheme detailed in the docs for the dagger package.

