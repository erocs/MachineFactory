package com.github.MrTwiggy.MachineFactory.Managers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;

import com.github.MrTwiggy.MachineFactory.MachineFactoryPlugin;
import com.github.MrTwiggy.MachineFactory.Interfaces.Machine;
import com.github.MrTwiggy.MachineFactory.Interfaces.Manager;
import com.github.MrTwiggy.MachineFactory.Machines.Smelter;
import com.github.MrTwiggy.MachineFactory.Utility.InteractionResponse;
import com.github.MrTwiggy.MachineFactory.Utility.InteractionResponse.InteractionResult;

/**
 * SmelterManager.java
 * Purpose: Manages the creation, updating, and maintenence of all Smelters
 *
 * @author MrTwiggy
 * @version 0.1 1/14/13
 */
public class SmelterManager implements Manager
{

	private List<Smelter> smelters; //List of current OreGins -
	private MachineFactoryPlugin plugin; //OreGinPlugin object
	
	/**
	 * Constructor
	 */
	public SmelterManager(MachineFactoryPlugin plugin)
	{
		this.plugin = plugin;
		smelters = new ArrayList<Smelter>();
		
		//To stop warnings temporarily
		this.plugin.getClass();
		smelters.getClass();
		
		updateMachines();
	}

	/**
	 * Save Smelters to file
	 */
	public void save(File file) throws IOException
	{

	}

	/**
	 * Load Smelters to file
	 */
	public void load(File file) throws IOException
	{
	
	}

	/**
	 * Updates all Smelters
	 */
	public void updateMachines()
	{
	}

	/**
	 * Attempts to create Smelter
	 */
	public InteractionResponse createMachine(Location machineLocation)
	{
		return null;
	}

	/**
	 * Adds an existing Smelter
	 */
	public InteractionResponse addMachine(Machine machine)
	{
		return new InteractionResponse(InteractionResult.FAILURE, "");
	}

	/**
	 * Returns Smelter at location if one exists
	 */
	public Machine getMachine(Location machineLocation)
	{
		return null;
	}

	/**
	 * Returns whether a Smelter exists at location
	 */
	public boolean machineExistsAt(Location machineLocation) 
	{
		return false;
	}

	/**
	 * Removes Smelter
	 */
	public void removeMachine(Machine machine) 
	{
		
	}
	
	/**
	 * Returns the OreGinSaves file name
	 */
	public String getSavesFileName()
	{
		return MachineFactoryPlugin.SMELTER_SAVES_FILE;
	}

}
