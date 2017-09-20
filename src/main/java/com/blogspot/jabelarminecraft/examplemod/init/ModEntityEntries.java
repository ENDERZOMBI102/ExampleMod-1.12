/**
    Copyright (C) 2017 by jabelar

    This file is part of jabelar's Minecraft Forge modding examples; as such,
    you can redistribute it and/or modify it under the terms of the GNU
    General Public License as published by the Free Software Foundation,
    either version 3 of the License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    For a copy of the GNU General Public License see <http://www.gnu.org/licenses/>.
*/
package com.blogspot.jabelarminecraft.examplemod.init;

import java.util.Set;

import com.blogspot.jabelarminecraft.examplemod.MainMod;
import com.google.common.collect.ImmutableSet;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

// @ObjectHolder(MainMod.MODID)
public class ModEntityEntries 
{
    // instantiate Enchantments
//	public final static EnchantmentCustom MY_COOL_ENCHANTMENT = new EnchantmentCustom();
	
	public static final Set<Enchantment> SET_INSTANCES = ImmutableSet.of(
//            MY_COOL_ENCHANTMENT
			);

	/**
	 * Initialize this mod's {@link Block}s with any post-registration data.
	 */
	private static void initialize() 
	{
	}

	@Mod.EventBusSubscriber(modid = MainMod.MODID)
	public static class RegistrationHandler 
	{
		/**
		 * Register this mod's {@link Enchantment}s.
		 *
		 * @param event The event
		 */
		@SubscribeEvent
		public static void onEvent(final RegistryEvent.Register<Enchantment> event) 
		{
			final IForgeRegistry<Enchantment> registry = event.getRegistry();

	        System.out.println("Registering recipes");

	        for (final Enchantment enchantment : SET_INSTANCES) {
				registry.register(enchantment);
			}

			initialize();
		}
	}
}
