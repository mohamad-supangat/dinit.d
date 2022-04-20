# The primary service

type = internal

depends-ms = getty
logfile    = /var/log/dinit/boot.log

waits-for = rclocal
waits-for = loginready
waits-for.d = boot.d
