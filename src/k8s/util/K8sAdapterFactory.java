/**
 */
package k8s.util;

import k8s.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see k8s.K8sPackage
 * @generated
 */
public class K8sAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static K8sPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public K8sAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = K8sPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected K8sSwitch<Adapter> modelSwitch =
		new K8sSwitch<Adapter>() {
			@Override
			public Adapter caseManifest(Manifest object) {
				return createManifestAdapter();
			}
			@Override
			public Adapter caseMetadata(Metadata object) {
				return createMetadataAdapter();
			}
			@Override
			public Adapter caseSpec(Spec object) {
				return createSpecAdapter();
			}
			@Override
			public Adapter casePodSpec(PodSpec object) {
				return createPodSpecAdapter();
			}
			@Override
			public Adapter caseDeploymentSpec(DeploymentSpec object) {
				return createDeploymentSpecAdapter();
			}
			@Override
			public Adapter caseDeploymentStrategy(DeploymentStrategy object) {
				return createDeploymentStrategyAdapter();
			}
			@Override
			public Adapter caseSelector(Selector object) {
				return createSelectorAdapter();
			}
			@Override
			public Adapter casePodTemplate(PodTemplate object) {
				return createPodTemplateAdapter();
			}
			@Override
			public Adapter caseTopologySpreadConstraint(TopologySpreadConstraint object) {
				return createTopologySpreadConstraintAdapter();
			}
			@Override
			public Adapter caseContainers(Containers object) {
				return createContainersAdapter();
			}
			@Override
			public Adapter caseVolume(Volume object) {
				return createVolumeAdapter();
			}
			@Override
			public Adapter caseAffinity(Affinity object) {
				return createAffinityAdapter();
			}
			@Override
			public Adapter caseRollingUpdateDeployment(RollingUpdateDeployment object) {
				return createRollingUpdateDeploymentAdapter();
			}
			@Override
			public Adapter caseLabelSelector(LabelSelector object) {
				return createLabelSelectorAdapter();
			}
			@Override
			public Adapter caseMatchExpressions(MatchExpressions object) {
				return createMatchExpressionsAdapter();
			}
			@Override
			public Adapter caseContainerPort(ContainerPort object) {
				return createContainerPortAdapter();
			}
			@Override
			public Adapter caseResourceRequirements(ResourceRequirements object) {
				return createResourceRequirementsAdapter();
			}
			@Override
			public Adapter caseEnvVar(EnvVar object) {
				return createEnvVarAdapter();
			}
			@Override
			public Adapter caseEnvVarSource(EnvVarSource object) {
				return createEnvVarSourceAdapter();
			}
			@Override
			public Adapter caseSecretKeySelector(SecretKeySelector object) {
				return createSecretKeySelectorAdapter();
			}
			@Override
			public Adapter caseObjectFieldSelector(ObjectFieldSelector object) {
				return createObjectFieldSelectorAdapter();
			}
			@Override
			public Adapter caseHTTPHeader(HTTPHeader object) {
				return createHTTPHeaderAdapter();
			}
			@Override
			public Adapter caseVolumeMount(VolumeMount object) {
				return createVolumeMountAdapter();
			}
			@Override
			public Adapter caseHTTPGetAction(HTTPGetAction object) {
				return createHTTPGetActionAdapter();
			}
			@Override
			public Adapter caseProbe(Probe object) {
				return createProbeAdapter();
			}
			@Override
			public Adapter caseExecAction(ExecAction object) {
				return createExecActionAdapter();
			}
			@Override
			public Adapter caseHandler(Handler object) {
				return createHandlerAdapter();
			}
			@Override
			public Adapter caseLifeCycle(LifeCycle object) {
				return createLifeCycleAdapter();
			}
			@Override
			public Adapter caseHostPathVolumeSource(HostPathVolumeSource object) {
				return createHostPathVolumeSourceAdapter();
			}
			@Override
			public Adapter caseNodeAffinity(NodeAffinity object) {
				return createNodeAffinityAdapter();
			}
			@Override
			public Adapter caseNodeSelector(NodeSelector object) {
				return createNodeSelectorAdapter();
			}
			@Override
			public Adapter caseNodeSelectorTerm(NodeSelectorTerm object) {
				return createNodeSelectorTermAdapter();
			}
			@Override
			public Adapter caseNodeSelectorRequirement(NodeSelectorRequirement object) {
				return createNodeSelectorRequirementAdapter();
			}
			@Override
			public Adapter caseMymap(Mymap object) {
				return createMymapAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link k8s.Manifest <em>Manifest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.Manifest
	 * @generated
	 */
	public Adapter createManifestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.Spec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.Spec
	 * @generated
	 */
	public Adapter createSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.PodSpec <em>Pod Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.PodSpec
	 * @generated
	 */
	public Adapter createPodSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.DeploymentSpec <em>Deployment Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.DeploymentSpec
	 * @generated
	 */
	public Adapter createDeploymentSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.DeploymentStrategy <em>Deployment Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.DeploymentStrategy
	 * @generated
	 */
	public Adapter createDeploymentStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.Selector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.Selector
	 * @generated
	 */
	public Adapter createSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.PodTemplate <em>Pod Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.PodTemplate
	 * @generated
	 */
	public Adapter createPodTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.TopologySpreadConstraint <em>Topology Spread Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.TopologySpreadConstraint
	 * @generated
	 */
	public Adapter createTopologySpreadConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.Containers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.Containers
	 * @generated
	 */
	public Adapter createContainersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.Volume
	 * @generated
	 */
	public Adapter createVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.Affinity <em>Affinity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.Affinity
	 * @generated
	 */
	public Adapter createAffinityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.RollingUpdateDeployment <em>Rolling Update Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.RollingUpdateDeployment
	 * @generated
	 */
	public Adapter createRollingUpdateDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.LabelSelector <em>Label Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.LabelSelector
	 * @generated
	 */
	public Adapter createLabelSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.MatchExpressions <em>Match Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.MatchExpressions
	 * @generated
	 */
	public Adapter createMatchExpressionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.ContainerPort <em>Container Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.ContainerPort
	 * @generated
	 */
	public Adapter createContainerPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.ResourceRequirements <em>Resource Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.ResourceRequirements
	 * @generated
	 */
	public Adapter createResourceRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.EnvVar <em>Env Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.EnvVar
	 * @generated
	 */
	public Adapter createEnvVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.EnvVarSource <em>Env Var Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.EnvVarSource
	 * @generated
	 */
	public Adapter createEnvVarSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.SecretKeySelector <em>Secret Key Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.SecretKeySelector
	 * @generated
	 */
	public Adapter createSecretKeySelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.ObjectFieldSelector <em>Object Field Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.ObjectFieldSelector
	 * @generated
	 */
	public Adapter createObjectFieldSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.HTTPHeader <em>HTTP Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.HTTPHeader
	 * @generated
	 */
	public Adapter createHTTPHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.VolumeMount <em>Volume Mount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.VolumeMount
	 * @generated
	 */
	public Adapter createVolumeMountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.HTTPGetAction <em>HTTP Get Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.HTTPGetAction
	 * @generated
	 */
	public Adapter createHTTPGetActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.Probe <em>Probe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.Probe
	 * @generated
	 */
	public Adapter createProbeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.ExecAction <em>Exec Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.ExecAction
	 * @generated
	 */
	public Adapter createExecActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.Handler
	 * @generated
	 */
	public Adapter createHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.LifeCycle <em>Life Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.LifeCycle
	 * @generated
	 */
	public Adapter createLifeCycleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.HostPathVolumeSource <em>Host Path Volume Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.HostPathVolumeSource
	 * @generated
	 */
	public Adapter createHostPathVolumeSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.NodeAffinity <em>Node Affinity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.NodeAffinity
	 * @generated
	 */
	public Adapter createNodeAffinityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.NodeSelector <em>Node Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.NodeSelector
	 * @generated
	 */
	public Adapter createNodeSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.NodeSelectorTerm <em>Node Selector Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.NodeSelectorTerm
	 * @generated
	 */
	public Adapter createNodeSelectorTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.NodeSelectorRequirement <em>Node Selector Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.NodeSelectorRequirement
	 * @generated
	 */
	public Adapter createNodeSelectorRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link k8s.Mymap <em>Mymap</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see k8s.Mymap
	 * @generated
	 */
	public Adapter createMymapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //K8sAdapterFactory
