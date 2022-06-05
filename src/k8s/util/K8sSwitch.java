/**
 */
package k8s.util;

import k8s.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see k8s.K8sPackage
 * @generated
 */
public class K8sSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static K8sPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public K8sSwitch() {
		if (modelPackage == null) {
			modelPackage = K8sPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case K8sPackage.METADATA: {
				Metadata metadata = (Metadata)theEObject;
				T result = caseMetadata(metadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.MANIFEST: {
				Manifest manifest = (Manifest)theEObject;
				T result = caseManifest(manifest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.SPEC_FACTORY: {
				SpecFactory specFactory = (SpecFactory)theEObject;
				T result = caseSpecFactory(specFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.SPEC: {
				Spec spec = (Spec)theEObject;
				T result = caseSpec(spec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.DEPLOYMENT: {
				Deployment deployment = (Deployment)theEObject;
				T result = caseDeployment(deployment);
				if (result == null) result = caseSpec(deployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.POD: {
				Pod pod = (Pod)theEObject;
				T result = casePod(pod);
				if (result == null) result = caseSpec(pod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.POD_SPEC: {
				PodSpec podSpec = (PodSpec)theEObject;
				T result = casePodSpec(podSpec);
				if (result == null) result = caseSpecFactory(podSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.DEPLOYMENT_SPEC: {
				DeploymentSpec deploymentSpec = (DeploymentSpec)theEObject;
				T result = caseDeploymentSpec(deploymentSpec);
				if (result == null) result = caseSpecFactory(deploymentSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.DEPLOYMENT_STRATEGY: {
				DeploymentStrategy deploymentStrategy = (DeploymentStrategy)theEObject;
				T result = caseDeploymentStrategy(deploymentStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.SELECTOR: {
				Selector selector = (Selector)theEObject;
				T result = caseSelector(selector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.POD_TEMPLATE: {
				PodTemplate podTemplate = (PodTemplate)theEObject;
				T result = casePodTemplate(podTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.TOPOLOGY_SPREAD_CONSTRAINT: {
				TopologySpreadConstraint topologySpreadConstraint = (TopologySpreadConstraint)theEObject;
				T result = caseTopologySpreadConstraint(topologySpreadConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.CONTAINERS: {
				Containers containers = (Containers)theEObject;
				T result = caseContainers(containers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.VOLUME: {
				Volume volume = (Volume)theEObject;
				T result = caseVolume(volume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.AFFINITY: {
				Affinity affinity = (Affinity)theEObject;
				T result = caseAffinity(affinity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.ROLLING_UPDATE_DEPLOYMENT: {
				RollingUpdateDeployment rollingUpdateDeployment = (RollingUpdateDeployment)theEObject;
				T result = caseRollingUpdateDeployment(rollingUpdateDeployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.LABEL_SELECTOR: {
				LabelSelector labelSelector = (LabelSelector)theEObject;
				T result = caseLabelSelector(labelSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.MATCH_EXPRESSIONS: {
				MatchExpressions matchExpressions = (MatchExpressions)theEObject;
				T result = caseMatchExpressions(matchExpressions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.CONTAINER_PORT: {
				ContainerPort containerPort = (ContainerPort)theEObject;
				T result = caseContainerPort(containerPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.RESOURCE_REQUIREMENTS: {
				ResourceRequirements resourceRequirements = (ResourceRequirements)theEObject;
				T result = caseResourceRequirements(resourceRequirements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.ENV_VAR: {
				EnvVar envVar = (EnvVar)theEObject;
				T result = caseEnvVar(envVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.ENV_VAR_SOURCE: {
				EnvVarSource envVarSource = (EnvVarSource)theEObject;
				T result = caseEnvVarSource(envVarSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.SECRET_KEY_SELECTOR: {
				SecretKeySelector secretKeySelector = (SecretKeySelector)theEObject;
				T result = caseSecretKeySelector(secretKeySelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.OBJECT_FIELD_SELECTOR: {
				ObjectFieldSelector objectFieldSelector = (ObjectFieldSelector)theEObject;
				T result = caseObjectFieldSelector(objectFieldSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.HTTP_HEADER: {
				HTTPHeader httpHeader = (HTTPHeader)theEObject;
				T result = caseHTTPHeader(httpHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.VOLUME_MOUNT: {
				VolumeMount volumeMount = (VolumeMount)theEObject;
				T result = caseVolumeMount(volumeMount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.HTTP_GET_ACTION: {
				HTTPGetAction httpGetAction = (HTTPGetAction)theEObject;
				T result = caseHTTPGetAction(httpGetAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.PROBE: {
				Probe probe = (Probe)theEObject;
				T result = caseProbe(probe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.EXEC_ACTION: {
				ExecAction execAction = (ExecAction)theEObject;
				T result = caseExecAction(execAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.HANDLER: {
				Handler handler = (Handler)theEObject;
				T result = caseHandler(handler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.LIFE_CYCLE: {
				LifeCycle lifeCycle = (LifeCycle)theEObject;
				T result = caseLifeCycle(lifeCycle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.HOST_PATH_VOLUME_SOURCE: {
				HostPathVolumeSource hostPathVolumeSource = (HostPathVolumeSource)theEObject;
				T result = caseHostPathVolumeSource(hostPathVolumeSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.NODE_AFFINITY: {
				NodeAffinity nodeAffinity = (NodeAffinity)theEObject;
				T result = caseNodeAffinity(nodeAffinity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.NODE_SELECTOR: {
				NodeSelector nodeSelector = (NodeSelector)theEObject;
				T result = caseNodeSelector(nodeSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.NODE_SELECTOR_TERM: {
				NodeSelectorTerm nodeSelectorTerm = (NodeSelectorTerm)theEObject;
				T result = caseNodeSelectorTerm(nodeSelectorTerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case K8sPackage.NODE_SELECTOR_REQUIREMENT: {
				NodeSelectorRequirement nodeSelectorRequirement = (NodeSelectorRequirement)theEObject;
				T result = caseNodeSelectorRequirement(nodeSelectorRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadata(Metadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manifest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manifest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManifest(Manifest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecFactory(SpecFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpec(Spec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployment(Deployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePod(Pod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pod Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pod Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePodSpec(PodSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentSpec(DeploymentSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentStrategy(DeploymentStrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelector(Selector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pod Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pod Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePodTemplate(PodTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topology Spread Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topology Spread Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopologySpreadConstraint(TopologySpreadConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainers(Containers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolume(Volume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affinity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affinity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffinity(Affinity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rolling Update Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rolling Update Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRollingUpdateDeployment(RollingUpdateDeployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelSelector(LabelSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Match Expressions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Match Expressions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatchExpressions(MatchExpressions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerPort(ContainerPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Requirements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceRequirements(ResourceRequirements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Env Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Env Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvVar(EnvVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Env Var Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Env Var Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvVarSource(EnvVarSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secret Key Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secret Key Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecretKeySelector(SecretKeySelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Field Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Field Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectFieldSelector(ObjectFieldSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPHeader(HTTPHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume Mount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume Mount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumeMount(VolumeMount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Get Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Get Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPGetAction(HTTPGetAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Probe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Probe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProbe(Probe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exec Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exec Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecAction(ExecAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandler(Handler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Life Cycle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Life Cycle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifeCycle(LifeCycle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host Path Volume Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host Path Volume Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostPathVolumeSource(HostPathVolumeSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Affinity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Affinity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeAffinity(NodeAffinity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeSelector(NodeSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Selector Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Selector Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeSelectorTerm(NodeSelectorTerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Selector Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Selector Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeSelectorRequirement(NodeSelectorRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //K8sSwitch
