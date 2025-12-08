/**
 * Copyright (C) 2016-2025 Expedia, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hotels.bdp.waggledance;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;

import com.hotels.bdp.waggledance.api.model.AbstractMetaStore;

public interface FederationsAdminClient {

  @GET
  @Path("/api/admin/federations")
  List<AbstractMetaStore> federations();

  @GET
  @Path("/api/admin/federations/{name}")
  AbstractMetaStore read(@PathParam("name") String name);

  @POST
  @Path("/api/admin/federations")
  @Consumes(MediaType.APPLICATION_JSON)
  void add(AbstractMetaStore federatedMetaStore);

  @DELETE
  @Path("/api/admin/federations/{name}")
  void remove(String name);

}
