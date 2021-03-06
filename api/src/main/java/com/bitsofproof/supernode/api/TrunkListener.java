/*
 * Copyright 2013 bits of proof zrt.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bitsofproof.supernode.api;

import java.util.List;

/**
 * Listener of new blocks on the trunk of the chain
 */
public interface TrunkListener
{
	/**
	 * called if blocks are added This is only called with blocks that establish a new longest chain. The new longest chain might imply a reorganisation whereby
	 * blocks previously on trunk are removed.
	 * 
	 * @param added
	 *            blocks
	 */
	public void trunkUpdate (List<Block> added);
}
