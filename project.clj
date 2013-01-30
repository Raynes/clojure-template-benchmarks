(defproject clojure-template-benchmarks "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main clojure-template-benchmarks.core
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [clabango "0.4"]
                 [criterium "0.3.1"]
                 [enlive "1.0.0"]
                 [hiccup "1.0.2"]
                 [stencil "0.3.0"]
                 [tinsel "0.4.0" :exclusions [hickory]]
                 [me.raynes/laser "0.1.21"]
                 [enlive "1.0.1"]])