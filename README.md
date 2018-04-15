# letspay
Android Kotlin application to display a list of transaction for an account using recycler view and multiple view holder types

FEATURES
* Displays a list of transactions corresponding to an account 
* Data will be pulled from data.json located at the root
* Account information on top scrolls off the screen
* Transactions (both cleared and pending) are shown in a combined list, by descending date order
* Group transactions by date
* Some transactions will be ATM withdrawals. These rows are indicated by the location icon.
* Tapping on an ATM withdrawal row will show the location of the ATM on a map
* Dynamically pulls down data from https://raw.githubusercontent.com/vimalp015/letspay/master/data.json

* Architecture: MVP
* Language: Kotlin
* Min SDK: API 16
* Dependency Injection: Dagger2
* Networking: Retrofit + RxJava2
* JSON library: gson
* Annotation processor: ButterKnife
* Reactive: RxJava2
* Unit tests: JUnit 4.12
* Mocking: Mockito
* Strictly Material Design
