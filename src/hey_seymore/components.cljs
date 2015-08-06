(ns hey-seymore.components
  (:require [sablono.core :refer-macros [html]]))

(defn like-seymore [data]
  (html [:div
             [:h1 "Seymore's new popularity: " (:likes @data)]
             [:div [:a {:href "#"
                        :onClick #(swap! data update-in [:likes] inc)}
                    "Thumbs up"]]]))