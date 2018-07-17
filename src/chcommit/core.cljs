(ns chcommit.core
  (:require [cljs.nodejs :as nodejs]
            ["http" :as http]))

(nodejs/enable-util-print!)

(require '["request" :as request]
         '["highland" :as highland])
(defn -main [& args]
  (-> (request "https://httpbin.org/ip")
      (.pipe (highland))
      (.each (fn [output]
                (print (.toString output "utf8"))))))

(set! *main-cli-fn* -main)
