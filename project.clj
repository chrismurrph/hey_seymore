(defproject hey-seymore "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3211"]
                 [sablono "0.3.4"]]
  :plugins [[lein-cljsbuild "1.0.5"]
            [lein-figwheel "0.3.3"]]
  :clean-targets ^{:protect false} [:target-path "out" "resources/public/cljs"]
  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src"]
              :figwheel true
              :compiler {:main hey-seymore.core
                         :recompile-dependents true ;<-- add this
                         :asset-path "cljs/out"
                         :output-to  "resources/public/cljs/main.js"
                         :output-dir "resources/public/cljs/out"}}]
              }
  :figwheel { ;; <-- add server level config here
             :css-dirs ["resources/public/css"]
             }
  )