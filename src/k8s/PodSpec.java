/**
 */
package k8s;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pod Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link k8s.PodSpec#getContainers <em>Containers</em>}</li>
 *   <li>{@link k8s.PodSpec#getTopologySpreadConstraints <em>Topology Spread Constraints</em>}</li>
 *   <li>{@link k8s.PodSpec#getInitContainers <em>Init Containers</em>}</li>
 *   <li>{@link k8s.PodSpec#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link k8s.PodSpec#getRestartPolicy <em>Restart Policy</em>}</li>
 *   <li>{@link k8s.PodSpec#getAffinity <em>Affinity</em>}</li>
 * </ul>
 *
 * @see k8s.K8sPackage#getPodSpec()
 * @model
 * @generated
 */
public interface PodSpec extends SpecFactory {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' attribute.
	 * @see #setContainers(EList)
	 * @see k8s.K8sPackage#getPodSpec_Containers()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<Containers> getContainers();

	/**
	 * Sets the value of the '{@link k8s.PodSpec#getContainers <em>Containers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containers</em>' attribute.
	 * @see #getContainers()
	 * @generated
	 */
	void setContainers(EList<Containers> value);

	/**
	 * Returns the value of the '<em><b>Topology Spread Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Spread Constraints</em>' attribute.
	 * @see #setTopologySpreadConstraints(EList)
	 * @see k8s.K8sPackage#getPodSpec_TopologySpreadConstraints()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<TopologySpreadConstraint> getTopologySpreadConstraints();

	/**
	 * Sets the value of the '{@link k8s.PodSpec#getTopologySpreadConstraints <em>Topology Spread Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Spread Constraints</em>' attribute.
	 * @see #getTopologySpreadConstraints()
	 * @generated
	 */
	void setTopologySpreadConstraints(EList<TopologySpreadConstraint> value);

	/**
	 * Returns the value of the '<em><b>Init Containers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Containers</em>' attribute.
	 * @see #setInitContainers(EList)
	 * @see k8s.K8sPackage#getPodSpec_InitContainers()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<Containers> getInitContainers();

	/**
	 * Sets the value of the '{@link k8s.PodSpec#getInitContainers <em>Init Containers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Containers</em>' attribute.
	 * @see #getInitContainers()
	 * @generated
	 */
	void setInitContainers(EList<Containers> value);

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' attribute.
	 * @see #setVolumes(EList)
	 * @see k8s.K8sPackage#getPodSpec_Volumes()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Sets the value of the '{@link k8s.PodSpec#getVolumes <em>Volumes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volumes</em>' attribute.
	 * @see #getVolumes()
	 * @generated
	 */
	void setVolumes(EList<Volume> value);

	/**
	 * Returns the value of the '<em><b>Restart Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart Policy</em>' attribute.
	 * @see #setRestartPolicy(String)
	 * @see k8s.K8sPackage#getPodSpec_RestartPolicy()
	 * @model
	 * @generated
	 */
	String getRestartPolicy();

	/**
	 * Sets the value of the '{@link k8s.PodSpec#getRestartPolicy <em>Restart Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart Policy</em>' attribute.
	 * @see #getRestartPolicy()
	 * @generated
	 */
	void setRestartPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Affinity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affinity</em>' reference.
	 * @see #setAffinity(Affinity)
	 * @see k8s.K8sPackage#getPodSpec_Affinity()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Affinity getAffinity();

	/**
	 * Sets the value of the '{@link k8s.PodSpec#getAffinity <em>Affinity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affinity</em>' reference.
	 * @see #getAffinity()
	 * @generated
	 */
	void setAffinity(Affinity value);

} // PodSpec
