(require 'lumo.build.api)

(lumo.build.api/build "src" {:output-to "lib/index.js"
                             :optimizations :none
                             :main 'chcommit.core
                             :output-dir "lib/out"
                             :install-deps false
                             :npm-deps {:request "2.83.0"
                                        :highland "2.11.0"}
                             :target :nodejs})
