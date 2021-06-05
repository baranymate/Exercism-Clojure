(ns secret-handshake)

(defn commands [num]
  (cond-> []
    (bit-test num 0) (conj "wink")
    (bit-test num 1) (conj "double blink")
    (bit-test num 2) (conj "close your eyes")
    (bit-test num 3) (conj "jump")
    (bit-test num 4) reverse))
