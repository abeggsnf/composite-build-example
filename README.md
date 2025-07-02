Execute the app by calling

```./gradlew A:assemble```

This will currently fail because there is a defined dependency that is incorrect intentionally. This will show
that even though the composite build `shared` with the modules B and C successfully configuring, when you rerun the 
command it reconfigures B and C again even though nothing changed and no parameters changed to invalidate their configuration.
Optimally the composite build would not invalidate the configuration of B and C. I don't know if composite builds can
be handled differently than normal builds in this regard.