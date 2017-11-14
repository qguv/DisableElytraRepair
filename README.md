# DisableElytraRepair

_Spigot/Bukkit plugin to prevent users from repairing Elytra without an anvil_

Thanks to [metalhedd from the Bukkit forum](https://bukkit.org/threads/remove-vanilla-repair.170075/#post-1825203) for the boilerplate and [redwall_hp](http://rdwl.xyz/blog/how-to-compile-spigot-plugins/) for the Spigot/Bukkit plugin build tutorial.

# Using

1. Stop your Spigot server if it's running
2. Download [the latest release .jar](https://github.com/qguv/DisableElytraRepair/releases) into the plugins directory on your Spigot server
3. Start your Spigot server

# Building from source

1. Install OpenJDK and Maven
2. Download [BuildTools.jar](https://hub.spigotmc.org/jenkins/job/BuildTools/lastSuccessfulBuild/artifact/target/BuildTools.jar) into a new, empty directory
3. Run `java -jar BuildTools.jar --rev latest` from that directory
4. Clone this repo into a new directory
5. Run `mvn clean package` from that directory
6. Copy the .jar file from the target subdirectory to the plugins directory on your Spigot server
