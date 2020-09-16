<<<<<<< HEAD
#Important:
Replace ADD YOUR KEY HERE  with your TMDB API key:
https://developers.themoviedb.org/3/getting-started/introduction

network/build.gradle:
       it.buildConfigField "String", "API_KEY", "\"ADD YOUR KEY HERE\""

#Testing dynamic feature:
https://medium.com/androiddevelopers/local-development-and-testing-with-fakesplitinstallmanager-57083e1840a4
https://medium.com/@AnilSisodiya/android-dynamic-delivery-feature-app-bundle-testing-d3e8a44fa84f

java -jar bundletool-all-1.2.0.jar build-apks --overwrite --local-testing --bundle C://Users//FreshWorks//Documents//study//BundleTest//app-debug.aab --output C://Users//FreshWorks//Documents//study//BundleTest//app-debug.apks
=======
https://medium.com/androiddevelopers/local-development-and-testing-with-fakesplitinstallmanager-57083e1840a4
https://medium.com/@AnilSisodiya/android-dynamic-delivery-feature-app-bundle-testing-d3e8a44fa84f

java -jar bundletool-all-1.2.0.jar build-apks --overwrite --local-testing --bundle C://Users//FreshWorks//Documents//study//BundleTest//app-debug.aab --output C://Users//FreshWorks//Documents//study//BundleTest//app-debug.apks

>>>>>>> 27f8259... Create readme.md
java -jar bundletool-all-1.2.0.jar install-apks --apks C://Users//FreshWorks//Documents//study//BundleTest//app-debug.apks --adb=C://Users//FreshWorks//AppData//local//Android//Sdk//platform-tools//adb.exe