(defproject funcbot "0.1.0-SNAPSHOT"
  :description "Small cljs/node server"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :source-paths ["src"]
  :dependencies [[org.clojure/clojure "1.5.1"]]

  ;; lein-cljsbuild plugin to build a CLJS project
  :plugins [[lein-cljsbuild "0.3.2"]]

  ;; cljsbuild options configuration
  :cljsbuild {:builds
               [{:id "funcbot-debug"
                 :source-paths ["src"]
                 :compiler {:output-to "resources/public/js/funcbot-debug.js"
                            :target :nodejs
                            :optimizations :simple
                            :static-fns true}}
                {:id "funcbot-release"
                 :source-paths ["src"]
                 :compiler {:output-to "resources/public/js/funcbot-release.js"
                            :target :nodejs
                            :optimizations :advanced}}]
              
              :repl-listen-port 9001})
