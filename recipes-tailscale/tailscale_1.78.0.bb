require tailscale.inc

# Find checksum with: https://pkgs.tailscale.com/stable/tailscale_${PV}_${ARCH_DIR}.tgz.sha256
SRC_URI[386.sha256sum]       = "864496beeebc58dcece694b4e2cbd90685f53463c91ed3f4ca3ca65fb1943e25"
SRC_URI[amd64.sha256sum]     = "149c2f92fbbb33ca4c13872e2c68e9bee3083d8ce7b41d72754d039907d6436a"
SRC_URI[arm.sha256sum]       = "d367fb3bcc26d546f980e1c4b852162aa95f6fadc7d117c3510b9586cd6eab4e"
SRC_URI[arm64.sha256sum]     = "0b0f10248c3ecc19452c0de4bcafc00d040eb94850ce0521e77906ddd6b735e4"
