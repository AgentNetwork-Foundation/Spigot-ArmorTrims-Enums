# Spigot-ArmorTrims-Enums
This is a small addition for spigot developers, who want to use Armor Trims as Enums

## Setup
Add the two files to your workspace

## How to use?
Check the if the instance of the ItemMeta is an ArmorMeta
```
if (itemMeta instanceof ArmorMeta) {
```
Then set the ArmorTrim
```
((ArmorMeta) itemMeta).setTrim(new ArmorTrim(TrimMaterialEnum.IRON.material, TrimPatternEnum.DUNE.pattern));
```

#### Developed by AgentNetwork
