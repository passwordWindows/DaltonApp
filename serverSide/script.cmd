:start 
IF EXIST "specimen.jpg" (
  python daltonize.py -d -t=d specimen.jpg specimenproto.jpg
  python daltonize.py -d -t=t specimen.jpg specimentrito.jpg
  goto :start
) ELSE (
  goto :start
)
